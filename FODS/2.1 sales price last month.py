import numpy as np
import csv


data = []
with open("C:/Users/bhara/Downloads/studies/work/New folder/FODS/2.1 sales price last month.csv", 'r') as csvfile:
    csvreader = csv.reader(csvfile)
    for row in csvreader:
        data.append(row)

sales_data = np.array(data[1:], dtype=float)

avg = np.mean(sales_data)

print("The average sold in the past month: {:.2f}".format(avg))


'''
sample output 
The average sold in the past month: 56527.34
'''