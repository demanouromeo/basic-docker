# Start your image with a node base image
FROM eclipse-temurin:21-jdk
 
# The /app directory should act as the main application directory
WORKDIR /app

# Copy the app package and package-lock.json file
COPY target/*.jar app.jar 
COPY . .

EXPOSE 8080

# Start the app using serve command
CMD ["java", "-jar", "app.jar"]