isConnected = [[1,1,0,1],
               [1,1,0,1],
               [0,0,1,0],
               [0,0,0,1]]
# Half of the array is repeated, only care about bottom left triangle half

# Map will contain cities that are connected together
connection_map = {}

for index, city in enumerate(isConnected):
    for i in range(index):
        # Check if index and i are connected
        if isConnected[index][i] == 1:
            if connection_map.get(index) == None:
                # If city is new to dictionary, add it and its connection as a set {i}
                connection_map[index] = {i}
            else:
                # If city is already added, append the extra city to the list ( this | means addition for sets)
                connection_map[index] = connection_map[index] | {i}
                # If the added city 'i' already has a value in the dictionary, remove it and add its connections
                # to the set
                if connection_map.get(i):
                    connection_map[index] = connection_map[index] | connection_map.get(i)
                    del connection_map[i]

# Calculate how many cities not in dictionary (Cities that have no connection)
isolated_cities = 0
for number in range(len(isConnected)):
    # Logic to check if city isn't in keys or values of dictionary
    if number not in list(connection_map.keys()) and not any(number in sublist for sublist in connection_map.values()):
        isolated_cities += 1

# Final answer is dictionary entries and isolated cities
print(len(connection_map.keys()) + isolated_cities)
