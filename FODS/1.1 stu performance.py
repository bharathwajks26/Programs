import numpy as np
import csv

data = []
with open("C:/Users/bhara/Downloads/studies/work/New folder/FODS/students_score.csv", 'r') as csvfile:
    csvreader = csv.reader(csvfile)
    for row in csvreader:
        data.append(row)
data = np.array(data[1:], dtype=float)  # Assuming the data is numerical


avg = np.mean(data, axis=0)


formatted_avg = ["{:.2f}".format(score) for score in avg]

# Print average scores
print("Average score:", formatted_avg)

# Find the highest average score
high = np.max(avg)
print("Highest average score:", high)

'''
sample output 
Average score: ['96.38', '79.80', '65.70', '60.33']
Highest average score: 96.375
'''