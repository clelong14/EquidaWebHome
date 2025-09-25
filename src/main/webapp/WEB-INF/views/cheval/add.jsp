<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Race" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Equida - Ajouter un cheval</title>
        <link rel="stylesheet" 
              href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
              integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
              crossorigin="anonymous">
        <style>
            body { 
                padding-top: 50px; 
            }
            .special { 
                padding-top: 50px; 
            }
            .form-container {
                background-color: #f8f9fa;
                border-radius: 5px;
                padding: 20px;
                margin-top: 20px;
                box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="<%= request.getContextPath() %>/cheval-servlet/list">
                        Gestion des chevaux
                    </a>
                </div>
            </div>
        </nav>

        <div class="container special">
            <div class="row">
                <div class="col-md-8 col-md-offset-2">
                    <div class="form-container">
                        <h2>Ajouter un nouveau cheval</h2>
                        
                        <form class="form-horizontal" action="<%= request.getContextPath() %>/cheval-servlet/add" method="POST">
                            
                            <!-- Nom du cheval -->
                            <div class="form-group">
                                <label for="nom" class="col-sm-3 control-label">Nom *</label>
                                <div class="col-sm-9">
                                    <input type="text" name="nom" id="nom" class="form-control" required>
                                </div>
                            </div>

                            <!-- Date de naissance -->
                            <div class="form-group">
                                <label for="dateNaissance" class="col-sm-3 control-label">Date de naissance</label>
                                <div class="col-sm-9">
                                    <input type="date" name="dateNaissance" id="dateNaissance" class="form-control">
                                </div>
                            </div>

                            <!-- Race -->
                            <div class="form-group">
                                <label for="race" class="col-sm-3 control-label">Race *</label>
                                <div class="col-sm-9">
                                    <select name="race" id="race" class="form-control" required>
                                        <option value="">Sélectionnez une race</option>
                                        <% ArrayList<Race> lesRaces = (ArrayList<Race>)request.getAttribute("pLesRaces");
                                           if (lesRaces != null) {
                                               for(Race race : lesRaces) { %>
                                                   <option value="<%= race.getId() %>">
                                                       <%= race.getNom() %>
                                                   </option>
                                        <% }} %>
                                    </select>
                                </div>
                            </div>

                            <!-- Boutons -->
                            <div class="form-group">
                                <div class="col-sm-offset-3 col-sm-9">
                                    <button type="submit" class="btn btn-primary">
                                        <span class="glyphicon glyphicon-plus"></span> Ajouter
                                    </button>
                                    <a href="<%= request.getContextPath() %>/cheval-servlet/list" class="btn btn-default">
                                        <span class="glyphicon glyphicon-remove"></span> Annuler
                                    </a>
                                </div>
                            </div>

                            <!-- Message d'erreur -->
                            <% if(request.getAttribute("message") != null) { %>
                                <div class="alert alert-danger">
                                    <%= request.getAttribute("message") %>
                                </div>
                            <% } %>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        
        <!-- Bootstrap JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>