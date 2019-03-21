# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples of minimal service clients"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclcpp"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_client/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d3c49f868240dbf65c261c2715e630ad"
SRC_URI[sha256sum] = "57c8748ace21f194c8bf414784332c78bcf43a84b3c560c652b996075c0c5499"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_client-0.5.1-0"

inherit ros
inherit ament


