# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that the srvs available through this plugin is the ones that are stored   on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake rclpy rqt-gui rqt-gui-py rqt-msg"
SRC_URI = "https://github.com/ros2-gbp/rqt_srv-release/archive/release/crystal/rqt_srv/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0ca2015a76d420c7047c6d7e2dfd9d70"
SRC_URI[sha256sum] = "06feb31b523415f057448cbd3190cfb4c60d97ac41a6a5233a2e93d6f03bca40"
S = "${WORKDIR}/rqt_srv-release-release-crystal-rqt_srv-1.0.1-0"

inherit catkin
