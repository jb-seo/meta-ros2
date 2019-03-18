# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_shell is a Python GUI plugin providing an interactive shell."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python-qt-binding qt-gui qt-gui-py-common rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros2-gbp/rqt_shell-release/archive/release/crystal/rqt_shell/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "00e6c95cc2a7245fd6d8dbeb50228850"
SRC_URI[sha256sum] = "5a8ea5e58a69cf9d636cf5fb54acc62e8c3d2ad5acea86c0361c2d613c1fb6ab"
S = "${WORKDIR}/rqt_shell-release-release-crystal-rqt_shell-1.0.0-0"

inherit ament
