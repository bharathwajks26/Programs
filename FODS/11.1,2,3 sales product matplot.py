import matplotlib.pyplot as plt
months = [1, 2, 3, 4, 5, 6]
sales = [1000, 1200, 900, 1500, 1800, 1300]
plt.plot(months, sales, marker='o', linestyle='-')
plt.xlabel('Month')
plt.ylabel('Sales')
plt.title('Sales of Product X Over Time')
plt.grid(True)
plt.show()

plt.scatter(months, sales)
plt.xlabel('Month')
plt.ylabel('Sales')
plt.title('Sales of Product X Over Time')
plt.grid(True)
plt.show()

plt.bar(months, sales)
plt.xlabel('Month')
plt.ylabel('Sales')
plt.title('Monthly Sales Data')
plt.grid(True)
plt.show()
