import cn.itcast3.Service;
import cn.itcast3.impl.A;

module one {
    exports cn.itcast3;
    exports cn.itcast2;

    provides Service with A;
}