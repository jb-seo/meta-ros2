# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_app provides the main to start an instance of the integrated graphical user interface provided by qt_gui."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-python qt-gui"
SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_gui_app/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c809621136a14e8aaa01e1c11dfcbd13"
SRC_URI[sha256sum] = "77c6b17ca375d948bce415805eb3eacce1c7d3177d0c9ee31cf086cc09d8a53d"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_gui_app-1.0.4-0"

inherit catkin
