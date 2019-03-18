# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui provides the main to start an instance of the ROS integrated graphical user interface provided by qt_gui."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python-qt-binding qt-gui rclpy"
SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/crystal/rqt_gui/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3aad87beb6061f0befd4d0b97cc2942"
SRC_URI[sha256sum] = "4e256bfa84d8af087d1201e8e2564f34e2ea8642f6c3e35000be52f35d7404ac"
S = "${WORKDIR}/rqt-release-release-crystal-rqt_gui-1.0.2-0"

inherit ament
