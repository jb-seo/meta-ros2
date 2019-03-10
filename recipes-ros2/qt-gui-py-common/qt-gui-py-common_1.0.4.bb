# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_py_common provides common functionality for GUI plugins written in Python."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-python python-qt-binding"
SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_gui_py_common/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "337b712f0808f54b382eabe3773bd163"
SRC_URI[sha256sum] = "a449f4765ba8c4c80b764aa9eaa8f9a17f431f52bb215e96b3a54373e4ad7a56"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_gui_py_common-1.0.4-0"

inherit catkin
