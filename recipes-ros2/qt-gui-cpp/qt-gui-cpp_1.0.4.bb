# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui_cpp provides the foundation for C++-bindings for qt_gui and creates bindings for every generator available.     At least one specific binding must be available in order to use C++-plugins."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake pkgconfig pluginlib python-qt-binding qt5-qmake qt-gui qtbase5-dev tinyxml2-vendor"
SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_gui_cpp/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4543b1441630e8ff51b9259cbbcc6f7b"
SRC_URI[sha256sum] = "5930b2323ee7bc08451cf3342bd79a0a13ffb9af35dcff5070d0f90749141138"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_gui_cpp-1.0.4-0"

inherit catkin
