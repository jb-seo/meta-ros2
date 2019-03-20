# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "control_msgs contains base messages and actions useful for     controlling robots.  It provides representations for controller     setpoints and joint and cartesian trajectories."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs builtin-interfaces rosidl-default-generators rosidl-default-runtime trajectory-msgs"
SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/bouncy/control_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b35f00beda3ea89b593659dca8662f03"
SRC_URI[sha256sum] = "631e64f5af2c4d37849942c809c4c8907a70283ae0432e8d3c824c2d5cc41841"
S = "${WORKDIR}/control_msgs-release-release-bouncy-control_msgs-2.0.0-0"


inherit ros
inherit ament
inherit pythonpath-insane

