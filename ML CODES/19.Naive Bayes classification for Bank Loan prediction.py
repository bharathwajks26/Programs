from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score

# Sample bank loan dataset (for demonstration purposes)
# You should replace this with a more extensive and relevant dataset
loan_features = [
    [25, 50000, 1],  # Age, Income, Education Level (1: Low, 2: Medium, 3: High)
    [35, 80000, 2],
    [45, 120000, 3],
    [30, 60000, 1],
    [40, 100000, 2],
]

loan_labels = [0, 1, 1, 0, 1]  # 0: Not Approved, 1: Approved

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(loan_features, loan_labels, test_size=0.2, random_state=42)

# Initialize and train the Gaussian Naive Bayes classifier
naive_bayes_classifier = GaussianNB()
naive_bayes_classifier.fit(X_train, y_train)

# Make predictions on the test set
y_pred = naive_bayes_classifier.predict(X_test)

# Display accuracy (for simplicity, not accuracy)
accuracy = accuracy_score(y_test, y_pred)
print(f"Accuracy: {accuracy:.2f}")
