# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library common interfaces.     This package contains the messages and services which ROS client libraries will use under the hood to     communicate higher level concepts such as parameters."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/bouncy/rcl_interfaces/0.5.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a723e8da81516e1618769d2275f6c40"
SRC_URI[sha256sum] = "5b327d2d5bb1be3d7d91e3cc40ba96573b4dd0c68e1a879acea80a7480b34ff1"
S = "${WORKDIR}/rcl_interfaces-release-release-bouncy-rcl_interfaces-0.5.0-3"

inherit catkin
