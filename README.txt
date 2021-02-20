Microservicios

- Fotos                   -> mongodb    -> 8090
- Mantenimiento de socios -> mongodb    -> 8092, 8093, 8094
- Cambiar estado          -> mysql      -> 8095, 8096
  crear la base de datos cjavadatabase
- Compras           -> 8094
- Eureka            -> 8761
- Zuul              -> 8099

Rutas

- man-socios              -> /api/socios/**
- servicio-cambiar-estado -> /api/cambiar/**
- servicio-foto           -> /api/fotos/**