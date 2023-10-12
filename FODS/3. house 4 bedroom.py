import numpy as np
data = np.array([
    [3, 1200, 250000],
    [4, 1500, 300000],
    [5, 1800, 350000],
    [4, 1600, 280000],
    [5, 2000, 400000],
    [6, 2200, 420000],
    [3, 1400, 260000],
    [4, 1700, 310000],
    [5, 1900, 370000],
    [4, 1800, 320000]
])
column = data[:, 0] 
houses = data[column > 4]
ave = np.mean(houses[:, 2])  
print("Average sales with four bedrooms:", ave)


'''
sample output 
Average sales with four bedrooms: 385000.0
'''