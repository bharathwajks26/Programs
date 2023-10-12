import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier

# Larger sample dataset (features and labels)
X = np.random.rand(100, 5)  # 100 samples with 5 features each
y = np.random.choice([0, 1], size=100)  # Random labels (0 or 1)

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Create a KNN classifier   
k = int(input("Enter the value of k (number of neighbors): "))
knn = KNeighborsClassifier(n_neighbors=k)

# Fit the classifier on the training data
knn.fit(X_train, y_train)

# Input features for the new patient
features = np.random.rand(1, 5)  # Generate random features for a new patient

# Predict whether the patient has the medical condition or not
predict = knn.predict(features)

if predict[0] == 0:
    print("The patient does not have the medical condition.")
else:
    print("The patient has the medical condition.")

'''sample output
Enter the value of k (number of neighbors): 30
The patient does not have the medical condition.
'''