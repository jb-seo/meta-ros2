# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Integration of the ROS package system and ROS-specific plugins for a Qt-based GUI."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake qt-dotgraph qt-gui qt-gui-app qt-gui-cpp qt-gui-py-common"
SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_gui_core/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "36c55fbedd905202a423e3d8602b0d00"
SRC_URI[sha256sum] = "93c1fed52a831d2b681f225525bb9a42218931f7f2d31dd484add4913e815cfe"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_gui_core-1.0.4-0"

inherit catkin
