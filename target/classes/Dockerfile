# Use a lightweight web server as the base image
FROM nginx:alpine

# Copy the index.html file into the nginx HTML directory
COPY index.html /usr/share/nginx/html/

# Expose port 80
EXPOSE 80

# Command to start the nginx server
CMD ["nginx", "-g", "daemon off;"]
