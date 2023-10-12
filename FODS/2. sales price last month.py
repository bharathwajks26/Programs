import numpy as np


sales_data = np.array([
    [170, 120, 150],[80, 90, 310],
    [200, 180, 220],[100, 120, 150],
    [80, 90, 110],[200, 580, 220],
    [100, 190, 150],[80, 90, 110],
    [290, 180, 220],[100, 120, 150],
    [80, 100, 110],[200, 140, 220],
    [100, 120, 550],[80, 90, 110],
    [200, 180, 220],[100, 120, 150],
    [60, 90, 160],[200, 180, 220],
    [100, 420, 150],[80, 90, 110],
    [200, 180, 240],[100, 120, 150],
    [50, 90, 110],[200, 180, 220]
])


av = np.mean(sales_data)

print("The average price of all products sold in the past month is:",av)


'''
sample output 
The average price of all products sold in the past month is: 160.0
'''