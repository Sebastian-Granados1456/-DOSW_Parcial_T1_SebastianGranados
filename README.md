# DOSW_Parcial_T1_SebastianGranados

**Link repositorio Bitacora:** https://github.com/Sebastian-Granados1456/Bitacora.git
**Nombre completo:** Sebastián Camilo Granados López
**Grupo:** DOSW 01

## Enunciado asignado: DOSW Parcial #3

## 1.
![Diagrama de Contexto.png](docs/images/Diagrama%20de%20Contexto.png)

## 2. Requerimientos

**Funcionales:**

* Un pedido puede contener hasta 5 productos diferentes, cada uno con sus propios extras. (Builder) 
* Cada pedido se construye seleccionando: un producto base, una o más opciones de personalización (extras) y una preferencia de entrega. (Decorator)
* El sistema debe ser compatible con móvil, tablet y escritorio.

**No Funcionales:**

* Colores de la cafetería: Azul (#1B3A5C) y Dorado (#C67A00).
* Tipografía: Poppins (Google Fonts)

## 3. Diagrama de casos de uso
![Diagrama de casos de uso.drawio.png](docs/images/Diagrama%20de%20casos%20de%20uso.drawio.png)


## 5. Descomposición de tareas

**Épica:**  

UFH - UNIVERSITY HUB FOOD
* Permitir a los usuarios de la cafetería construir y personalizar pedidos de comida de forma flexible y ordenada.

**Feature:**

Construcción y personalización de pedidos
* Como parte de gestión de pedidos, el sistema debe permitir la construcción de un pedido paso a paso y aplicar personalizaciones dinámicas a cada producto sin modificar su estructura base.

**Historia de Usuario:**
* Como cliente quiero armar mi pedido seleccionado hasta 5 productos diferentes, cada uno con sus propios extras para poder personalizar mi comida antes de la confirmación de mi compra.

**Tareas:**
* Implementar la clase PedidoBuilder (patrón Builder) que permita construir un pedido de forma incremental, validando que no
  se superen los 5 productos.
* Implementar los Decorator de extras (ej. ProteinaExtraDecorator, AguacateDecorator) que envuelvan un producto base y sumen
  su costo sin alterar la clase original del producto.
*  Implementar el cálculo del precio final del pedido, sumando el precio base, los extras aplicados vía Decorator y el costo
   de entrega.

---

## Evidencias

### Herramienta de modelado — Draw.io
![Acceso activo a draw.io](docs/images/evidencia_drawio.png)

### Figma
![Acceso activo a Figma](docs/images/evidencia_figma.png)

### Proyecto Maven corriendo correctamente
Salida de `mvn test` — compila y ejecuta el test de `AppTest` sin errores
(ver [`docs/images/evidencia_maven_test.txt`](docs/images/evidencia_maven_test.txt)):

```
[INFO] Running edu.dosw.parcial.AppTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.046 s -- in edu.dosw.parcial.AppTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
