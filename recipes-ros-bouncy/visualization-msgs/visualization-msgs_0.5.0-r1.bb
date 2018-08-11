# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some visualization and interaction related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/visualization_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "541d51cafa5db1343d110055552bdb3e"
SRC_URI[sha256sum] = "feaec6f76da5a19ac39fb04b380e6bd397344ebfef3fa6bf90af6d99a4966506"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-visualization_msgs-0.5.0-1"

inherit catkin
