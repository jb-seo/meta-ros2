# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files for turtlebot2 teleop demo"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "joy launch ros2run teleop-twist-joy turtlebot2-drivers"
SRC_URI = "https://github.com/ros2-gbp/turtlebot2_demo-release/archive/release/bouncy/turtlebot2_teleop/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0477edef35f8405c6286ea6396f7ef8c"
SRC_URI[sha256sum] = "4b9637f72e5feb43457214652f4868d3c1351160cc5ab9e6ca4ee04641665430"
S = "${WORKDIR}/turtlebot2_demo-release-release-bouncy-turtlebot2_teleop-0.5.1-0"


inherit ros
inherit ament

