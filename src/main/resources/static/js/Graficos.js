     window.onload = function() {
            JSC.chart('barras', {
                debug: false,
                type: 'column',
                legend_visible: false,
                palette: ['#8b5cf6'],
                axisX_label_text: 'Dias',
                axisY_label_text: 'Minutos',
                series: [
                    {
                        name: 'Tempo',
                        points: [
                            {x: 'Seg', y: 60},
                            {x: 'Ter', y: 45},
                            {x: 'Qua', y: 90},
                            {x: 'Qui', y: 0},
                            {x: 'Sex', y: 75},
                            {x: 'Sab', y: 120},
                            {x: 'Dom', y: 30}
                        ]
                    }
                ],
                chartArea_fill: 'transparent',
                defaultPoint_label_visible: true
            });

            JSC.chart('pizza', {
                debug: false,
                type: 'pie',
                legend_position: 'right',
                palette: ['#8b5cf6', '#3b82f6', '#f472b6', '#10b981'],
                series: [
                    {
                        name: 'Categorias',
                        points: [
                            {x: 'Força', y: 40},
                            {x: 'Cardio', y: 30},
                            {x: 'Flexibilidade', y: 15},
                            {x: 'Funcional', y: 15}
                        ]
                    }
                ],
                chartArea_fill: 'transparent'
            });
        };