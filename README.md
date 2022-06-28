# Spring Boot Device Seller

## EndPoints

### Sign-Up
````
POST /api/authentication/sign-up HTTP/1.1
Host: 127.0.0.1:8080
Content-Type: application/json
Content-Length: 71

{
"name":"admin",
"username":"admin",
"password":"admin"
}
````

### Sign-In
````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 48

{
"username":"admin",
"password":"admin"
}
````

### change-Role
````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX1VTRVIiLCJ1c2VySWQiOjEsImV4cCI6MTY1NjQyMjIwM30.WnrEXw7G3syFVDbmvO0PzqjlMuoDMdn_GuPzjm8UYvMgA5d2GkhH_qEsoYuvdUQnIy6C2jruLU-VjIlA5ptH-g
````

### save device
````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJST0xFX0FETUlOIiwidXNlcklkIjoxLCJleHAiOjE2NTY0MjI1MTZ9.BLIxpIWjUfuubEt1DpY1ZTqUwYTI8kzAQacUimXyaWz4L5NySSXcSrQoeKtzvGl4bMe_rpxXfujwryofjGP4wg
Content-Type: application/json
Content-Length: 96

{
    "name":"dev-6",
    "description":"desc-6",
    "price":5000,
    "deviceType":"TABLETS"
}
````
### Get all devices
````
GET /api/device HTTP/1.1
Host: localhost:8080
Ocp-Apim-Subscription-Key: 912a3523a5434c11b80623ffa871e3d3
Content-Type: application/json
Content-Length: 181

{
	"documents": [
		{
			"id": "1",
			"language": "en",
			"text": "Great atmosphere. Close to plenty of restaurants, hotels, and transit! Staff are friendly and helpful."
		}
	]
}
````

### Delete Device 
````
DELETE /api/device/7 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjU2NDI1NDQ2fQ.j53gaZ5FxBHdtjuDWnwL_k7b7UfKpg4cnyI-_RDbRIwjLvFtndhPFUzlR0wWIq3D2jHDCRTrgL74GEYiw8-CZw
````

### Save Purchase
````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
Content-Type: application/json

{
    "userId": 2,
    "deviceId": 2,
    "price": 30000,
    "color": "blue"
}
````

### Get All Purchase
````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjMyMTQ3ODMwfQ.7zX58-yVhZihWKTiZFn-lzsJfBjSc66gFY_UVBP-tLuvB-tzUHaoRVTLmfOlVxhhRd0-c7_lVk7ofkkJBrqgUg
````


