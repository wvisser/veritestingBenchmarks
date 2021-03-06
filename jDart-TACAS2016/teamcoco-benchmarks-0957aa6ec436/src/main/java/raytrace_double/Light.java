/**
 * @author @{user}
 */
package raytrace_double;

/**
 * @author luckow
 *
 */
//All the public variables here are ugly, but I
//wanted Lights and Surfaces to be "friends"
class Light {
 public static final int AMBIENT = 0;
 public static final int DIRECTIONAL = 1;
 public static final int POINT = 2;

 public int lightType;
 public Vector3D lvec;           // the position of a point light or
                                 // the direction to a directional light
 public double ir, ig, ib;        // intensity of the light source

 public Light(int type, Vector3D v, double r, double g, double b) {
     lightType = type;
     ir = r;
     ig = g;
     ib = b;
     if (type != AMBIENT) {
         lvec = v;
         if (type == DIRECTIONAL) {
             lvec.normalize();
         }
     }
 }
}
