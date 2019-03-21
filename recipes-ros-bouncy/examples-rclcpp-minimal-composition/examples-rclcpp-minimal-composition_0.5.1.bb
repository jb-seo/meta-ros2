# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Minimalist examples of composing nodes in the same   process"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "class-loader rclcpp std-msgs"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_composition/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "950c03b36771f2ac998618890b6d5fd1"
SRC_URI[sha256sum] = "45f97841606fdf79c8dc099a9df0fe8a2afa7ef73080d8f55166f44ec76d3b72"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_composition-0.5.1-0"

inherit ros
inherit ament


