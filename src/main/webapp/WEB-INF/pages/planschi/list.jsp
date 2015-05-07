<!DOCTYPE html>
<html>

<head>
    <script type="text/ecmascript" src="/webjars/jquery/2.1.3/jquery.js"></script>
    <script type="text/ecmascript" src="/webjars/bootstrap/3.3.2/js/bootstrap.js"></script>
    <script type="text/ecmascript" src="/webjars/jquery-ui/1.11.4/jquery-ui.js"></script>
    <script type="text/ecmascript" src="/webjars/jqgrid/4.7.0/js/jquery.jqGrid.js"></script>
    <script type="text/ecmascript" src="/webjars/jqgrid/4.7.0/js/i18n/grid.locale-en.js"></script>
    <script type="text/ecmascript" src="/scripts/base.js"></script>
    <script type="text/ecmascript" src="/scripts/planschi/list.js"></script>

    <link rel="stylesheet" href="webjars/bootstrap/3.3.2/css/bootstrap.css"/>
    <link rel="stylesheet" href="webjars/jquery-ui/1.11.4/jquery-ui.css"/>
    <link rel="stylesheet" href="webjars/jquery-ui-themes/1.11.4/dark-hive/jquery-ui.css"/>
    <link rel="stylesheet" href="webjars/jqgrid/4.7.0/css/ui.jqgrid.css"/>

    <title>List of all Planschis</title>

</head>

<body>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Brand Icon</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/planschis">Planschis</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="well col-xs-12 col-sm-12 col-md-12 col-lg-12">

        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <div id="griddiv"/>
            </div>
        </div>

    </div>
</div>
</body>
</html>