# Simulación de Horas de Trabajo

Este proyecto simula la cantidad de horas de trabajo para los próximos 30 días y muestra cómo se actualiza el arreglo de horas diariamente.

## Descripción

1. **Inicialización del Arreglo**:
   - El programa inicializa un arreglo `horas` con valores aleatorios entre 0 y 8 para representar las horas de trabajo diarias durante 30 días.

2. **Actualización Diaria del Arreglo**:
   - Cada día, el programa desplaza todos los valores del arreglo una posición hacia adelante y añade una nueva cantidad de horas aleatoria al final del arreglo.

3. **Simulación del Paso del Tiempo**:
   - El usuario puede ingresar cuántos días desea simular. El programa actualizará y mostrará el estado del arreglo después de cada día simulado.

## Estructura del Código

- **Método `main`**: 
  - Inicializa el arreglo con valores aleatorios.
  - Solicita al usuario la cantidad de días a simular.
  - Actualiza y muestra el arreglo diariamente según el número de días ingresado.

- **Método `imprimirHoras`**:
  - Imprime el contenido del arreglo `horas`.

- **Método `desplazarHoras`**:
  - Desplaza los valores del arreglo y añade una nueva cantidad de horas al final del arreglo.

## Cómo Ejecutar el Programa

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
