# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal publisher nodes"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclcpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_publisher/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a350b9037e483bc94c47cb261ca831aa"
SRC_URI[sha256sum] = "18b3dd04fd992e018e67643216a178d5570b02efec95f3cd69ed5b1c47a0db9c"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_publisher-0.5.1-0"

inherit ros
inherit ament


