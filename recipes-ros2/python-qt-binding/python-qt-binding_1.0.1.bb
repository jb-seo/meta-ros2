# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This stack provides Python bindings for Qt.     There are two providers: pyside and pyqt.  PySide2 is available under     the GPL, LGPL and a commercial license.  PyQt is released under the GPL.      Both the bindings and tools to build bindings are included from each     available provider.  For PySide, it is called &quot;Shiboken&quot;.  For PyQt,     this is called &quot;SIP&quot;.      Also provided is adapter code to make the user's Python code     independent of which binding provider was actually used which makes     it very easy to switch between these."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=ced11b5ec2a0776fd01740115328457b"

DEPENDS = "ament-cmake python3-qt5-bindings qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/python_qt_binding-release/archive/release/crystal/python_qt_binding/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "45ea8b8124e31c966277b729b949c7ff"
SRC_URI[sha256sum] = "fdf6f093e4849aba0695f6fa8c9bbe628d7da9b9745f7274b0fcc5e004cd0b08"
S = "${WORKDIR}/python_qt_binding-release-release-crystal-python_qt_binding-1.0.1-0"

inherit catkin
