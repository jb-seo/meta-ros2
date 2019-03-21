# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple follower using centroid in depth images."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "astra-camera geometry-msgs launch rclcpp ros2run sensor-msgs turtlebot2-drivers"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_follower/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d793f99cf471744d7c30739d0e86304d"
SRC_URI[sha256sum] = "dfb21c06df4db78817abbbab4459f9a86f97ba708777aa0b57e7e7b71ed470ee"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_follower-0.5.1-0"

inherit ros
inherit ament


