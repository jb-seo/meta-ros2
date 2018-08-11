# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some message definitions which describe geometric shapes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake geometry-msgs rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/shape_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98cb89c53b3d931f9ca84b131b98d1ba"
SRC_URI[sha256sum] = "cdb7301cc4695f59aac1d48b02e66581f05484b7c6fe9e240ccfcb8c5d9dbff9"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-shape_msgs-0.5.0-1"

inherit catkin
