# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that the msgs available through this plugin is the ones that are stored   on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python-qt-binding rclpy rqt-console rqt-gui rqt-gui-py rqt-py-common"
SRC_URI = "https://github.com/ros2-gbp/rqt_msg-release/archive/release/crystal/rqt_msg/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14b7b4e0c13f255e3f971e84ca11702d"
SRC_URI[sha256sum] = "60afac52d8e0054ba07516357ddf272edea74802ee7b779ed0c89a9d39cd88fd"
S = "${WORKDIR}/rqt_msg-release-release-crystal-rqt_msg-1.0.1-0"

inherit ament
