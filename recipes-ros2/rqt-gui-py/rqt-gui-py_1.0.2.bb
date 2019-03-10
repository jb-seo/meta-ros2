# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_gui_py enables GUI plugins to use the Python client library for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "qt-gui rqt-gui"
SRC_URI = "https://github.com/ros2-gbp/rqt-release/archive/release/crystal/rqt_gui_py/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "621d1fdb8e9b352a3c01f244e3cc80cd"
SRC_URI[sha256sum] = "88e7fbe247e2a45351e3c8a7e882b302a3c7a7a6766a191be34edf2ef1d639bb"
S = "${WORKDIR}/rqt-release-release-crystal-rqt_gui_py-1.0.2-0"

inherit catkin
