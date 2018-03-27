    $( "#memoryslider" ).slider({
        orientation: 'horizontal',
        min: 500,
        max: 16000,
        step: 500,
        range: 'min',
        animate: true,
        slide: function(event, ui) {
        	$("#memoryvalue").val(ui.value);
        }
	});

    $( "#diskslider" ).slider({
        orientation: 'horizontal',
        min: 20,
        max: 1000,
        step: 50,
        range: 'min',
        animate: true,
        slide: function(event, ui) {
            $("#diskvalue").val(ui.value);
        }
    });

    var configMapper = [
        {memory: 500, disksize: 20},
        {memory: 1500, disksize: 50},
        {memory: 3000, disksize: 100},
        {memory: 6000, disksize: 200},
        {memory: 15000, disksize: 500}
    ];
    function selectConfig(config){
        var configList = $('.config').children();
        for (var i = 0; i < configList.length; i++) {
            configList.eq(i).removeClass('current');
        };
        $("#config_"+config).addClass('current');

        var memory = configMapper[config].memory;
        var disksize = configMapper[config].disksize;
        $("#memoryslider").slider('value', memory);
        $("#diskslider").slider('value', disksize);
        $("#memoryvalue").val(memory);
        $("#diskvalue").val(disksize);

    }