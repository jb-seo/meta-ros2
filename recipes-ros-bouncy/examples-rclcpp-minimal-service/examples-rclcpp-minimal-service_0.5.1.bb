# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A minimal service server which adds two numbers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclcpp"
SRC_URI = "https://github.com/ros2-gbp/examples-release/archive/release/bouncy/examples_rclcpp_minimal_service/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "910f53eb49fef5225c4940d14c934e57"
SRC_URI[sha256sum] = "6ed98e35b6e0afbb218fcd0da6cafbfbda8969fee4afa6ca20843eda42008b42"
S = "${WORKDIR}/examples-release-release-bouncy-examples_rclcpp_minimal_service-0.5.1-0"

inherit ros
inherit ament


