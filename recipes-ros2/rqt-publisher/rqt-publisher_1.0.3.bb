# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_publisher provides a GUI plugin for publishing arbitrary messages with fixed or computed field values."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python-qt-binding qt-gui-py-common rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros2-gbp/rqt_publisher-release/archive/release/crystal/rqt_publisher/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf3944ea7f00982b65eac9bc405898db"
SRC_URI[sha256sum] = "8d6b4cc21b3b3a1a0e1394eba2afd3921d28af0482c12af5e466d0a2080d22f7"
S = "${WORKDIR}/rqt_publisher-release-release-crystal-rqt_publisher-1.0.3-0"

inherit ament
