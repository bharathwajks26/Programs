import matplotlib.pyplot as plt
months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
temperature = [10, 12, 15, 20, 25, 28, 30, 29, 26, 20, 15, 12]  
rainfall = [50, 40, 60, 80, 100, 120, 130, 120, 100, 80, 60, 40]  

plt.figure(figsize=(10, 5))
plt.plot(months, temperature, marker='o')
plt.title("Monthly Temperature Data")
plt.xlabel("Month")
plt.ylabel("Temperature (°C)")
plt.grid(True)
plt.show()

plt.figure(figsize=(10, 5))
plt.scatter(months, rainfall, color='blue', marker='o')
plt.title("Monthly Rainfall Data")
plt.xlabel("Month")
plt.ylabel("Rainfall (mm)")
plt.grid(True)
plt.show()
