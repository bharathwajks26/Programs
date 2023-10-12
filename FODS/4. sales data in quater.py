import numpy as np


sales_data = np.array([250000, 300000, 350000, 400000])


total_sales = np.sum(sales_data)


percentage_increase = ((sales_data[3] - sales_data[0]) / sales_data[0]) * 100

print("Total sales for the year:", total_sales)
print("Percentage increase in sales from Q1 to Q4:", percentage_increase, "%")


'''
sample output 
Total sales for the year: 1300000
Percentage increase in sales from Q1 to Q4: 60.0 %
'''