<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Deadliest Viruses</title>
    <style>
        table {
            font-family: "Times New Roman", SansSerif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border:4px solid darkslateblue;
            text-align: left;
            padding: 10px;
            width: 160px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
        img{
            max-height: 120px;
            max-width: 160px;
        }
    </style>
</head>
<body>

<h2>5 Deadliest Viruses</h2>
<table>
    <tr>
        <!-- Removing the ID so the customer does not see it.
        <th>ID</th>
        -->
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
        <th>Image</th>
    </tr>
    <c:forEach var = "virus" items = "${viruslist}">
        <tr>
            <!-- I set up a very nice naming scheme for my product SKUs. Its unfortunate we have to hide the ID now.
            <td>${virus.getId()}</td>
            -->
            <td>${virus.getName()}</td>
            <td>${virus.getDescription()}</td>
            <td>${virus.getSymptoms()}</td>
            <td>${virus.getDuration()}</td>
            <td>${virus.getMortalityRate()}</td>
            <td><img src="${virus.getImageAddress()}"></td>
        </tr>
    </c:forEach>
</table>
</body>

</html>
