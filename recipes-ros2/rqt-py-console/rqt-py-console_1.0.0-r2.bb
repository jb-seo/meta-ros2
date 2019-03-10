# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_py_console is a Python GUI plugin providing an interactive Python console."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-python python-qt-binding qt-gui qt-gui-py-common rclpy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros2-gbp/rqt_py_console-release/archive/release/crystal/rqt_py_console/1.0.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8bbd464633e28f802994d3d320d53794"
SRC_URI[sha256sum] = "2797cbe4f59a613ed53201713ad7a0a3d5f3db5271bca452012500b8ab8130c6"
S = "${WORKDIR}/rqt_py_console-release-release-crystal-rqt_py_console-1.0.0-2"

inherit catkin
