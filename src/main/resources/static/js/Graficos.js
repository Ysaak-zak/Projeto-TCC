var chart = JSC.chart('barras', {
    debug: true,
    defaultSeries_type: 'column',
    legend_visible: false,
    defaultPoint_label_visible: true,
    yAxis_visible: false,
    legend_visible: false,
    defaultPoint_label_visible: true,
    chartArea_fill: '#000000',
    xAxis_defaultTick: {
        placement: 'inside',
        label_style: { color: '#fff', fontWeight: 'bold' }
    },
    series: [
        {
            name: 'GRAFICO UM',
            palette: ['#4b0082', '#4b0082', '#4b0082', '#4b0082', '#4b0082', '#4b0082', '#4b0082'],
            points: [
                { name: 'DOMINGO', y: 15 },
                { name: 'SEGUNDA', y: 15 },
                { name: 'TERÇA', y: 118 },
                { name: 'QUARTA', y: 130 },
                { name: 'QUINTA ', y: 123 },
                { name: 'SEXTA', y: 123 },
                { name: 'SABADO ', y: 123 }

            ]
        }
    ]
});



var chart = JSC.Chart('pizza', {
    debug: true,
     chartArea_fill: '#000000',
    legend: {
        visible: false
    },
    defaultSeries: { type: 'pie', pointSelection: true },
    defaultPoint_label_text: '<b>%name</b>',
    series: [
        {
            points: [
                { name: 'Aerobicos', y: 35, color: '#FF5733' },     
                { name: 'Musculação', y: 30, color: '#33FF57' },    
                { name: 'Funcionais', y: 20, color: '#3357FF' },    
                { name: 'Flexibilidade', y: 10, color: '#FFBD33' },
                { name: 'Equilibrio', y: 5 }
            ]
        }
    ]
});