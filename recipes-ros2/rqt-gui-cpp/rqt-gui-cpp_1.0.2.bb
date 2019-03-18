# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_cpp enables GUI plugins to use the C++ client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " qt-gui qt-gui-cpp qtbase5-dev rclcpp"
SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/crystal/rqt_gui_cpp/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34ef5e7ffd32b906a85d72d6d7d6fd7d"
SRC_URI[sha256sum] = "d8138f546878edf1673ed52dc1b4e02ecce8cde383249634a49c4416e0e1a823"
S = "${WORKDIR}/rqt-release-release-crystal-rqt_gui_cpp-1.0.2-0"

inherit ament
