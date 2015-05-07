jQuery(function() {
    var colNames = [
        'ID',
        'Description',
        'Hour',
        'Minute',
        'Second',
        'Duration'
    ];

    var colModel = [
        { index: 'id', name: 'id', editable: false, sortable: false },
        { index: 'description', name: 'description', editable: false, sortable: true },
        { index: 'hour', name: 'hour', editable: false, sortable: true },
        { index: 'minute', name: 'minute', editable: false, sortable: true },
        { index: 'second', name: 'second', editable: false, sortable: true },
        { index: 'duration', name: 'duration', editable: false, sortable: true }
    ];

    var options = {
        editType: 'form',
        service: 'planschi',
        table: 'planschis',
        colNames: colNames,
        colModel: colModel
    };

    base.jqgrid(options);
});