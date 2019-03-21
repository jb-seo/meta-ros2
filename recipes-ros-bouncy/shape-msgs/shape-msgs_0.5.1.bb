# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some message definitions which describe geometric shapes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "geometry-msgs rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/shape_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5fc160f496a42d0285332d8f8101c93f"
SRC_URI[sha256sum] = "5454e65e7aa3d071b37dff2b23a792f1e1fbe409896eb2cf334d6216a060f515"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-shape_msgs-0.5.1-0"

inherit ros
inherit ament


