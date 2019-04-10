# ros_cmake.bbclass

inherit cmake

FILES_${PN} += " \
    ${libdir}/lib*.so \
"
