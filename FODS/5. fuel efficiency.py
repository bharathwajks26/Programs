import numpy as np
data = [] 
a = int(input("Enter the size of data:"))
for i in range(0,a):
    b = int(input("Enter the data:"))
    data.append(b)
fuel = np.array(data)
ave = np.mean(fuel)
print("Average Fuel Efficiency: {:.2f} ".format(ave))
 
fuel_model1 = fuel[0]
fuel_model2 = fuel[1]
per = ((fuel_model2 - fuel_model1) / fuel_model1) * 100
print("Percentage improvement {:.2f}%".format(per))


'''
sample output 
Enter the size of data:2
Enter the data:12
Enter the data:23
Average Fuel Efficiency: 17.50
Percentage improvement 91.67%
'''
