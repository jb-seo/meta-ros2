# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RQT plugin for monitoring ROS processes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python3-psutil python-qt-binding rclpy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros2-gbp/rqt_top-release/archive/release/crystal/rqt_top/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1eee7ebd8aee77d8fed5ac90b52742c5"
SRC_URI[sha256sum] = "64d8df02dbd0b780950cf5bf408506d0d16c070ea0709ed521369492941342dc"
S = "${WORKDIR}/rqt_top-release-release-crystal-rqt_top-1.0.0-0"

inherit ament
