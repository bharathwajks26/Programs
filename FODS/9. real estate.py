import pandas as pd
data = {
    'property ID': [1, 2, 3, 4, 5, 6],
    'location': ['City A', 'City B', 'City A', 'City C', 'City B', 'City C'],
    'number of bedrooms': [3, 4, 5, 5, 2, 4],
    'area in square feet': [1500, 1800, 1600, 2200, 1200, 2000],
    'listing price': [250000, 320000, 280000, 420000, 180000, 380000]
}
property = pd.DataFrame(data)
average = property.groupby('location')['listing price'].mean()
four_bedrooms = property[property['number of bedrooms'] > 4]
total4bed = len(four_bedrooms)
largest_area = property[property['area in square feet'] == property['area in square feet'].max()]
print("Average listing price")
print(average)
print("\nproperties with more than four bedrooms:", total4bed)
print("\nProperty with the largest area:")
print(largest_area)


'''
sample output 
Average listing price
location
City A    265000.0
City B    250000.0
City C    400000.0
Name: listing price, dtype: float64

properties with more than four bedrooms: 2

Property with the largest area:
   property ID location  number of bedrooms  area in square feet  listing price
3            4   City C                   5                 2200         420000
'''