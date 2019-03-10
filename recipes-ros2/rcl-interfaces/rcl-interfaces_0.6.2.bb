# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library common interfaces.     This package contains the messages and services which ROS client libraries will use under the hood to     communicate higher level concepts such as parameters."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/crystal/rcl_interfaces/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1974a72ed897c346fd9a19bbd742218"
SRC_URI[sha256sum] = "4518dbf5431445c497cd191f7dc7d4cf836412acddc172e9d7d2b8df63233cc6"
S = "${WORKDIR}/rcl_interfaces-release-release-crystal-rcl_interfaces-0.6.2-0"

inherit catkin
